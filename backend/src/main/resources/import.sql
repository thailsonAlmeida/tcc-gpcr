/*Manager*/
INSERT INTO tb_manager(name, cpf, rg, birth, phone1, phone2, cep, street, number, city, states, username, password, email) VALUES ('Thais Fragoso', '401.698.975-67', '41.125.697-x', '13/12/1994', '(15) 9 8656-6987', '(11) 9 8245-6598', '18456-650', 'Rua Alamo', 15, 'Boituva', 'SP', 'thais', '123#', 'thais@gmail.com');
INSERT INTO tb_manager(name, cpf, rg, birth, phone1, phone2, cep, street, number, city, states, username, password, email) VALUES ('Thailson Almeida', '401.898.985-87', '42.135.797-x', '13/12/1994', '(15) 9 7656-6687', '(11) 9 9245-8598', '19456-650', 'Rua Alamo', 15, 'Boituva', 'SP', 'thailson', '123#', 'thailson@gmail.com');

/*Professional*/
INSERT INTO tb_professional(name, cpf, rg, birth, phone1, phone2, cep, street, number, city, states, username, password, email, registry) VALUES ('Elyda Carmargo', '501.698.985-87', '45.125.637-x', '13/08/1994', '(11) 9 7657-6987', '(11) 9 8949-6598', '18456-650', 'Street A', 20, 'Boituva', 'SP', 'elyda', '123#', 'elyda@gmail.com', '1598mx');
INSERT INTO tb_professional(name, cpf, rg, birth, phone1, phone2, cep, street, number, city, states, username, password, email, registry) VALUES ('Cleiton Santos Vilas', '451.695.885-87', '44.425.637-x', '13/08/1976', '(21) 9 9877-6987', '(11) 9 8977-6598', '19456-750', 'Street B', 660, 'Porto Feliz', 'SP', 'cleiton', '123#', 'cleiton@gmail.com', '6598dx');

/*Patient*/
INSERT INTO tb_patient(name, cpf, rg, birth, phone1, phone2, cep, street, number, city, states, covenant_plan, covenant_number, email) VALUES ('Amanda Elias', '511.198.385-37', '55.625.657-x', '26/07/1978', '(11) 9 7687-6987', '(11) 9 8810-6578', '18456-660', 'Rua Expedicionario', 30, 'Boituva', 'SP', 'Unimed BTrix', '1252365487', 'amanda@gmail.com');
INSERT INTO tb_patient(name, cpf, rg, birth, phone1, phone2, cep, street, number, city, states, covenant_plan, covenant_number, email) VALUES ('Silvia Campos', '421.995.685-27', '34.925.737-x', '20/06/1979', '(15) 9 9878-3977', '(11) 9 8720-5588', '16456-150', 'Rua Sargento Feri', 665, 'Boituva', 'SP', 'Plan 4sx', '9865325647', 'silvia@gmail.com');
INSERT INTO tb_patient(name, cpf, rg, birth, phone1, phone2, cep, street, number, city, states, covenant_plan, covenant_number, email) VALUES ('Maria Antonieta', '431.895.685-77', '44.825.937-x', '12/03/1999', '(19) 9 9867-5937', '(11) 9 8631-4598', '17456-050', 'Rua Mila Alves', 978, 'Boituva', 'SP', 'UniPremium', '6965878965', 'maria@gmail.com');

INSERT INTO tb_patient(name, cpf, rg, birth, phone1, phone2, cep, street, number, city, states, email) VALUES ('Carlos Brandão', '451.795.985-87', '64.525.637-x', '01/02/1988', '(11) 9 9867-4987', '(11) 9 8542-3508', '19456-650', 'Rua Frios', 223, 'Porto Feliz', 'SP', 'carlos@gmail.com');
INSERT INTO tb_patient(name, cpf, rg, birth, phone1, phone2, cep, street, number, city, states, email) VALUES ('Julia Brandão', '442.292.685-87', '54.235.637-x', '10/02/1990', '(11) 9 9777-9987', '(11) 9 8653-3308', '18956-650', 'Rua Lemom', 323, 'Porto Feliz', 'SP', 'julia@gmail.com');

/*Procedure*/
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (1, 1, 1, '21/08/2023', '10:00', '11:00', 'Avaliativo', 'It has survived not only five centuries, but also the leap into electronic typesetting', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (1, 1, 1, '22/08/2023', '10:00', '11:00', 'Evolutivo', 'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. ', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (1, 1, 1, '23/08/2023', '10:00', '11:00', 'Evolutivo', 'Many desktop publishing packages and web page editors now use Lorem Ipsum ', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (1, 1, 1, '24/08/2023', '10:00', '11:00', 'Evolutivo', 'Various versions have evolved over the years, sometimes by accident,', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (1, 1, 1, '25/08/2023', '10:00', '11:00', 'Evolutivo', 'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical', 'confirmar');

INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (2, 2, 1, '21/08/2023', '13:00', '14:00', 'Avaliativo', 'It has survived not only five centuries, but also the leap into electronic typesetting', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (2, 2, 1, '22/08/2023', '13:00', '14:00', 'Evolutivo', 'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. ', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (2, 2, 1, '23/08/2023', '13:00', '14:00', 'Evolutivo', 'Many desktop publishing packages and web page editors now use Lorem Ipsum ', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (2, 2, 1, '24/08/2023', '13:00', '14:00', 'Evolutivo', 'Various versions have evolved over the years, sometimes by accident,', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (2, 2, 1, '25/08/2023', '13:00', '14:00', 'Evolutivo', 'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical', 'confirmar');

INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (1, 3, 2, '21/08/2023', '13:00', '14:00', 'Avaliativo', 'It has survived not only five centuries, but also the leap into electronic typesetting', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (1, 3, 2, '22/08/2023', '13:00', '14:00', 'Evolutivo', 'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. ', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (1, 3, 2, '23/08/2023', '13:00', '14:00', 'Evolutivo', 'Many desktop publishing packages and web page editors now use Lorem Ipsum ', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (1, 3, 2, '24/08/2023', '13:00', '14:00', 'Evolutivo', 'Various versions have evolved over the years, sometimes by accident,', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (1, 3, 2, '25/08/2023', '13:00', '14:00', 'Evolutivo', 'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical', 'confirmar');

INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (2, 4, 2, '21/08/2023', '10:00', '11:00', 'Avaliativo', 'It has survived not only five centuries, but also the leap into electronic typesetting', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (2, 4, 2, '22/08/2023', '10:00', '11:00', 'Evolutivo', 'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. ', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (2, 4, 2, '23/08/2023', '10:00', '11:00', 'Evolutivo', 'Many desktop publishing packages and web page editors now use Lorem Ipsum ', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (2, 4, 2, '24/08/2023', '10:00', '11:00', 'Evolutivo', 'Various versions have evolved over the years, sometimes by accident,', 'confirmar');
INSERT INTO tb_procedure(id_manager, id_patient, id_professional, data, start, finish, type, description, status ) VALUES (2, 4, 2, '25/08/2023', '10:00', '11:00', 'Evolutivo', 'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical', 'confirmar');
