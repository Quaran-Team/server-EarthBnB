create table reviews (
    id BIGINT not null auto_increment,
    username TEXT,
    userprofile TEXT,
    reviewtext TEXT,
    reviewcategories JSON,
    posteddate TEXT,
    locationreviewed BIGINT,
    FOREIGN KEY (locationreviewed) REFERENCES locations(id),
    PRIMARY KEY (id)
);
INSERT INTO reviews (
        username,
        userprofile,
        reviewtext,
        reviewcategories,
        posteddate,
        locationreviewed,
    )
VALUES (
        "Trevor",
        "Trevor Profile link",
        "This place was awesome. We have a lot of fun at local entertainment spots. Worth checking out.",
        '{
            "Cleanliness": 5.0,
            "Accuracy": 5.0,
            "Communication": 5.0,
            "Location": 5.0,
            "Check-in": 5.0,
            "Value": 4.9
        }',
        "September 2020",
        2
    );