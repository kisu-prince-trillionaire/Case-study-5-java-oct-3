CREATE DATABASE CASE_STUDY5_REFERRAL;
USE CASE_STUDY5_REFERRAL;

CREATE TABLE REGISTRATION (
NAME VARCHAR(20),
EMAIL VARCHAR(20),
PHONE INT
);

CREATE TABLE LOGIN (
USER_NAME VARCHAR(20),
PASSWORD VARCHAR(20)
);

CREATE TABLE USER (
NAME VARCHAR(20),
MOBILE INT,
EMAIL VARCHAR(20),
REFERRAL_CODE VARCHAR(20)
);

CREATE TABLE REFERRAL_DATA (
COUPON_CODE VARCHAR(20),
STATUS VARCHAR(20),
BONUS INT
);

DESC REGISTRATION;
SELECT * FROM REGISTRATION;

DESC LOGIN;
SELECT * FROM LOGIN;

DESC USER;
SELECT * FROM USER;

DESC REFERRAL_DATA;
SELECT * FROM REFERRAL_DATA;