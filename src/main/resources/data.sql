INSERT INTO users (id, email, password, enabled) values ('d7e96744fa144697ba912a75adc5b27e', 'fernandopillo@gmail.com', '12345', true);

INSERT INTO companies (id, name) values ('1cd0e9b8b2d049efb42043dea1b6d122', 'Dalben');

INSERT INTO managers (id, first_name, last_name, user_id, company_id) values ('9d0353b6a0be418c98b3e99cd0d0ab67', 'Fernando', 'Pillo', 'd7e96744fa144697ba912a75adc5b27e', '1cd0e9b8b2d049efb42043dea1b6d122');
