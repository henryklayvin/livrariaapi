create table livro(
    id varchar(255) not null primary key,
    titulo varchar(50) not null,
    autor varchar(50) not null,
    descricao varchar(300),
    preco numeric(18,2)
);