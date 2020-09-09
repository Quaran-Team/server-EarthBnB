CREATE TABLE reviews (
    id BIGINT NOT NULL AUTO_INCREMENT,
    username VARCHAR(255),
    userprofile VARCHAR(255),
    reviewtext VARCHAR(255),
    category_cleanliness DECIMAL(2, 1),
    category_accuracy DECIMAL(2, 1),
    category_communication DECIMAL(2, 1),
    category_location DECIMAL(2, 1),
    category_checkin DECIMAL(2, 1),
    category_value DECIMAL(2, 1),
    posteddate VARCHAR(255),
    locationreviewed BIGINT,
    FOREIGN KEY (locationreviewed) REFERENCES locations(id),
    PRIMARY KEY (id)
);