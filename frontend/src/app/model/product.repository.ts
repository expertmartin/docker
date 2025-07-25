import { Injectable } from "@angular/core";
import { Product } from "./product.model";
//import { StaticDataSource } from "./static.datasource";
import { RestDataSource } from "./rest.datasource";

@Injectable()
export class ProductRepository {
    private products: Product[] = [];
    private categories: string[] = [];
    constructor(private dataSource: RestDataSource) {
         console.log('initialize data 0000');
        dataSource.getProducts().subscribe(data => {
            this.products = data;
            this.categories = data.map(p => p.category ?? "(None)")
                .filter((c, index, array) => array.indexOf(c) == index).sort();
        });
    }
    getProducts(category?: string): Product[] {
        return this.products
            .filter(p => category == undefined || category == p.category);
    }
    getProduct(id: number): Product | undefined {
        return this.products.find(p => p.id == id);
    }
    getCategories(): string[] {
        return this.categories;
    }

    saveProduct(product: Product) {
        console.log('in saveProduct: ', product);
        if (product.id == null || product.id == 0) {
            this.dataSource.saveProduct(product)
                .subscribe(p => this.products.push(p));
        } else {
            this.dataSource.updateProduct(product)
                .subscribe(p => {
                    this.products.splice(this.products.
                        findIndex(p => p.id == product.id), 1, product);
                });
        }
    }
    deleteProduct(id: number) {
        this.dataSource.deleteProduct(id).subscribe(p => {
            this.products.splice(this.products.
                findIndex(p => p.id == id), 1);
        })
    }
}