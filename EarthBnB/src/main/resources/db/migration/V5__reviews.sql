CREATE TABLE `reviews` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `username` TEXT,
    `userprofile` TEXT,
    `reviewtext` TEXT,
    `category_cleanliness` DECIMAL(2, 1),
    `category_accuracy` DECIMAL(2, 1),
    `category_communication` DECIMAL(2, 1),
    `category_location` DECIMAL(2, 1),
    `category_checkin` DECIMAL(2, 1),
    `category_value` DECIMAL(2, 1),
    `posteddate` TEXT,
    `locationreviewed` BIGINT,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB;