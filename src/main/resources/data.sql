INSERT INTO users (id, email, password, enabled) values ('d7e96744fa144697ba912a75adc5b27e', 'fernandopillo@gmail.com', '12345', true);

INSERT INTO companies (id, name, trade_name, cnpj, municipal_inscription, state_inscription, logo_url) values ('1cd0e9b8b2d049efb42043dea1b6d122', 'Dalben', 'Dalben Supermercados', '31.157.253/0001-05', '', '', 'logo.jpg');

INSERT INTO managers (id, first_name, last_name, rg, cpf, photo_url, user_id, company_id) values ('9d0353b6a0be418c98b3e99cd0d0ab67', 'Fernando', 'Pillo', '19.546.777-2', '587.423.725-93', 'photo.jpg', 'd7e96744fa144697ba912a75adc5b27e', '1cd0e9b8b2d049efb42043dea1b6d122');
