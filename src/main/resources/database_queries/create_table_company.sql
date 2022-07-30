CREATE TABLE company(
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    nip TEXT NOT NULL,
    id_address BIGINT REFERENCES address(id)
);