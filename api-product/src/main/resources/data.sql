INSERT INTO product (NAME, CATEGORY, DESCRIPTION, PRICE) VALUES ('Kayak', 'Watersports', 'A boat for one person', 275) ON CONFLICT (NAME) DO NOTHING;
INSERT INTO product (NAME, CATEGORY, DESCRIPTION, PRICE) VALUES ('Lifejacket', 'Watersports', 'Protective and fashionable', 48.95) ON CONFLICT (NAME) DO NOTHING;
INSERT INTO product (NAME, CATEGORY, DESCRIPTION, PRICE) VALUES ('Soccer Ball', 'Soccer', 'FIFA-approved size and weight', 19.50) ON CONFLICT (NAME) DO NOTHING;
INSERT INTO product (NAME, CATEGORY, DESCRIPTION, PRICE) VALUES ('Corner Flags', 'Soccer', 'Give your playing field a professional touch', 34.95) ON CONFLICT (NAME) DO NOTHING;
INSERT INTO product (NAME, CATEGORY, DESCRIPTION, PRICE) VALUES ('Stadium', 'Soccer', 'Flat-packed 35,000-seat stadium', 795.00) ON CONFLICT (NAME) DO NOTHING;
INSERT INTO product (NAME, CATEGORY, DESCRIPTION, PRICE) VALUES ('Thinking Cap', 'Chess', 'Improve brain efficiency by 75%', 16) ON CONFLICT (NAME) DO NOTHING;
INSERT INTO product (NAME, CATEGORY, DESCRIPTION, PRICE) VALUES ('Unsteady Chair', 'Chess', 'Secretly give your opponent a disadvantage', 29.95) ON CONFLICT (NAME) DO NOTHING;
INSERT INTO product (NAME, CATEGORY, DESCRIPTION, PRICE) VALUES ('Human Chess Board', 'Chess', 'A fun game for the family', 75) ON CONFLICT (NAME) DO NOTHING;
INSERT INTO product (NAME, CATEGORY, DESCRIPTION, PRICE) VALUES ('Bling Bling King', 'Chess', 'Gold-plated, diamond-studded King', 1200) ON CONFLICT (NAME) DO NOTHING;
