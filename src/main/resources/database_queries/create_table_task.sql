CREATE TABLE task(
    id BIGSERIAL PRIMARY KEY,
    id_temp BIGSERIAL,
    id_string TEXT NOT NULL UNIQUE,
    description TEXT NOT NULL,
    notes TEXT,
    date DATE NOT NULL,
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
    price INT NOT NULL,
    status TEXT NOT NULL,
    id_address BIGINT NOT NULL REFERENCES address(id),
    id_customer BIGINT NOT NULL REFERENCES customer(id),
    id_technician BIGINT NOT NULL REFERENCES technician(id)
);