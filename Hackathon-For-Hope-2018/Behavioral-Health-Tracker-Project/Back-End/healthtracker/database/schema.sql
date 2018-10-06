-- ----------------------------------------------------------------------------
-- CREATE DATABASE
-- ----------------------------------------------------------------------------

BEGIN;

-- During development, can uncomment the below to erase database content before
-- rewriting it

-- DROP TABLE IF EXISTS doctor;
-- DROP TABLE IF EXISTS patient;
-- DROP TABLE IF EXISTS cases;
-- DROP TABLE IF EXISTS tasks;
-- DROP TABLE IF EXISTS ratings;
-- DROP TABLE IF EXISTS caseTask;
-- DROP TABLE IF EXISTS drPatient;

CREATE TABLE doctor (
    dr_id SERIAL PRIMARY KEY,
    fname varchar(32) NOT NULL,
    lname varchar(32) NOT NULL
);

CREATE TABLE patient (
    patient_id SERIAL PRIMARY KEY,
    patient_fname varchar(32) NOT NULL,
    patient_lname varchar(32) NOT NULL,
    gaurdian_fname varchar(32) NOT NULL,
    gaurdian_lname varchar(32) NOT NULL
);

CREATE TABLE cases (
    case_id SERIAL PRIMARY KEY,
    doctor_id INTEGER NOT NULL,
    patient_id INTEGER NOT NULL
);

CREATE TABLE tasks (
    task_id SERIAL PRIMARY KEY,
    descript varchar(1028) NOT NULL
);

CREATE TABLE ratings (
    rating_id SERIAL PRIMARY KEY,
    caseTask_id INTEGER NOT NULL,
    gaurdian_Rating INTEGER NOT NULL,
    patient_Rating INTEGER NOT NULL,
    gaurdian_comment varchar(1028),
    patient_comment varchar(1028)
);

CREATE TABLE caseTask (
    caseTask_id SERIAL PRIMARY KEY,
    case_id INTEGER NOT NULL,
    task_id INTEGER NOT NULL
);

CREATE TABLE drPatient (
    drPatient_id SERIAL PRIMARY KEY,
    dr_id INTEGER NOT NULL,
    patient_id INTEGER NOT NULL
);

COMMIT;