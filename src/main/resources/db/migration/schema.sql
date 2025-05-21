CREATE TABLE user (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    phone_number VARCHAR(20),
    email VARCHAR(255)
);

CREATE TABLE group (
    id INT PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE post (
    id INT PRIMARY KEY,
    title VARCHAR(255),
    author INT,
    content TEXT,
    FOREIGN KEY (author) REFERENCES user(id)
);

CREATE TABLE post_image (
    id INT PRIMARY KEY,
    image_url VARCHAR(255),
    post_id INT,
    FOREIGN KEY (post_id) REFERENCES post(id)
);
