CREATE TABLE customer(
    id BIGSERIAL PRIMARY KEY,
    first_name text NOT NULL,
    last_name text NOT NULL,
    phone_number text NOT NULL,
    email text,
    id_address1 BIGINT REFERENCES address(id) NOT NULL,
    id_address2 BIGINT REFERENCES address(id),
    id_address3 BIGINT REFERENCES address(id),
    id_address4 BIGINT REFERENCES address(id),
    id_company BIGINT REFERENCES company(id)
);