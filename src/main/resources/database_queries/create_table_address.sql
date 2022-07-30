CREATE TABLE address(
    id BIGSERIAL PRIMARY KEY,
    zip_code TEXT NOT NULL,
    city TEXT NOT NULL,
    street_name TEXT NOT NULL,
    building_number TEXT NOT NULL,
    local_number TEXT,
    device1 TEXT NOT NULL,
    device2 TEXT,
    device3 TEXT,
    device4 TEXT
);