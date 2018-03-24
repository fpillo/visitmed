--users
INSERT INTO users (id, email, password, enabled) VALUES ('d7e96744fa144697ba912a75adc5b27e', 'fernandopillo@gmail.com', '12345', true);
INSERT INTO users (id, email, password, enabled) VALUES ('f566207f81bc482f80eb688cbb4b7264', 'marcola@hotmail.com', '12345', true);

--companies
INSERT INTO companies (id, name, trade_name, cnpj, municipal_inscription, state_inscription, logo_url) VALUES ('1cd0e9b8b2d049efb42043dea1b6d122', 'Dalben', 'Dalben Supermercados', '31.157.253/0001-05', '', '', 'logo.jpg');

--employess
INSERT INTO employees (id, first_name, last_name, employee_type, rg, cpf, photo_url, user_id, company_id, address_id, contact_id) VALUES ('9d0353b6a0be418c98b3e99cd0d0ab67', 'Fernando', 'Pillo', 'MANAGER', '19.546.777-2', '587.423.725-93', 'photo.jpg', 'd7e96744fa144697ba912a75adc5b27e', '1cd0e9b8b2d049efb42043dea1b6d122', '7cb56a71fdc44eeabb0cb7d704511404', 'de278f4bcc694b258e58-0e8e964a6426');
INSERT INTO employees (id, first_name, last_name, employee_type, rg, cpf, photo_url, user_id, company_id) VALUES ('03ff5ab1fd4447f8aa3613115abc312a', 'Marcos', 'Arrombado', 'SELLER', '195467772', '58742372593', 'baleia.jpg', 'f566207f81bc482f80eb688cbb4b7264', '1cd0e9b8b2d049efb42043dea1b6d122', 'df2b60369aca43c29019815c67f1fcd3', 'cc4ff2370a96448c8c7256062c1248c2');

--addresses
INSERT INTO address (id, state, city, zip_code, neighborhood, street, number, latitude, longitude) VALUES ('7cb56a71fdc44eeabb0cb7d704511404', 'SP', 'CAMPINAS', '13087630', 'RUA FRANCISCO JOSÉ DE SOUZA', 327, -22.232, -44.332);
INSERT INTO address (id, state, city, zip_code, neighborhood, street, number, latitude, longitude) VALUES ('df2b60369aca43c29019815c67f1fcd3', 'SP', 'CAMPINAS', '13087630', 'RUA FRANCISCO JOSÉ DE SOUZA', 450, -22.235, -44.336);

--contacts
INSERT INTO contacts (id, phoneNumber, mobileNumber, whatsapp) VALUES ('de278f4bcc694b258e58-0e8e964a6426', '1932569457', '19992549527', '19992549527');
INSERT INTO contacts (id, phoneNumber, mobileNumber, whatsapp) VALUES ('cc4ff2370a96448c8c7256062c1248c2', '1932569457', '19992549527', '19992549527');

