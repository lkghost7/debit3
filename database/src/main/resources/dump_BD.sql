--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.14
-- Dumped by pg_dump version 9.5.14

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE IF EXISTS hibernate;
--
-- Name: hibernate; Type: DATABASE; Schema: -; Owner: root
--

CREATE DATABASE hibernate WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Russian_Russia.1251' LC_CTYPE = 'Russian_Russia.1251';


ALTER DATABASE hibernate OWNER TO root;

\connect hibernate

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: company; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.company (
    id integer NOT NULL,
    name character varying(200)
);


ALTER TABLE public.company OWNER TO root;

--
-- Name: company_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.company_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.company_id_seq OWNER TO root;

--
-- Name: company_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.company_id_seq OWNED BY public.company.id;


--
-- Name: debitor; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.debitor (
    id integer NOT NULL,
    subdivisions character varying(200),
    debitor character varying(200),
    date_of_occurrence character varying(200),
    principal_amount character varying(200),
    sent_date character varying(200),
    amount_claimed character varying(200),
    date_of_debit character varying(200),
    redemption_amount character varying(200),
    balance_owed character varying(200),
    redemption_measures text
);


ALTER TABLE public.debitor OWNER TO root;

--
-- Name: debitors_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.debitors_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.debitors_id_seq OWNER TO root;

--
-- Name: debitors_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.debitors_id_seq OWNED BY public.debitor.id;


--
-- Name: email_detail; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.email_detail (
    id integer NOT NULL,
    name character varying(200)
);


ALTER TABLE public.email_detail OWNER TO root;

--
-- Name: email_detail_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.email_detail_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.email_detail_id_seq OWNER TO root;

--
-- Name: email_detail_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.email_detail_id_seq OWNED BY public.email_detail.id;


--
-- Name: person; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.person (
    id integer NOT NULL,
    name character varying(200),
    company_id integer,
    famaly character varying(200),
    email_detail_id integer
);


ALTER TABLE public.person OWNER TO root;

--
-- Name: persons_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.persons_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.persons_id_seq OWNER TO root;

--
-- Name: persons_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.persons_id_seq OWNED BY public.person.id;


--
-- Name: privilege; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.privilege (
    id integer NOT NULL,
    name character varying(20) NOT NULL
);


ALTER TABLE public.privilege OWNER TO root;

--
-- Name: privileges_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.privileges_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.privileges_id_seq OWNER TO root;

--
-- Name: privileges_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.privileges_id_seq OWNED BY public.privilege.id;


--
-- Name: registry_of_contract; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.registry_of_contract (
    id bigint NOT NULL,
    number_of_contract character varying(200),
    name_of_counterparty character varying(200),
    conclusion_date character varying(200),
    validity_date character varying(200),
    subject_contract character varying(200),
    amount_contract character varying(200),
    settlement_procedure character varying(200),
    executor character varying(200),
    note character varying(200)
);


ALTER TABLE public.registry_of_contract OWNER TO root;

--
-- Name: registry_of_contracts_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.registry_of_contracts_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.registry_of_contracts_id_seq OWNER TO root;

--
-- Name: registry_of_contracts_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.registry_of_contracts_id_seq OWNED BY public.registry_of_contract.id;


--
-- Name: system_user; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.system_user (
    id integer NOT NULL,
    name character varying(40),
    family character varying(40),
    e_mail character varying(40) NOT NULL,
    gender character varying(20),
    password character varying(255) NOT NULL,
    home_region_country character varying(40),
    home_region_city character varying(40),
    payment_country character varying(40),
    payment_city character varying(40)
);


ALTER TABLE public.system_user OWNER TO root;

--
-- Name: system_users_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.system_users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.system_users_id_seq OWNER TO root;

--
-- Name: system_users_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.system_users_id_seq OWNED BY public.system_user.id;


--
-- Name: users_privilege; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.users_privilege (
    user_id integer NOT NULL,
    privilege_id integer NOT NULL
);


ALTER TABLE public.users_privilege OWNER TO root;

--
-- Name: id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.company ALTER COLUMN id SET DEFAULT nextval('public.company_id_seq'::regclass);


--
-- Name: id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.debitor ALTER COLUMN id SET DEFAULT nextval('public.debitors_id_seq'::regclass);


--
-- Name: id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.email_detail ALTER COLUMN id SET DEFAULT nextval('public.email_detail_id_seq'::regclass);


--
-- Name: id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.person ALTER COLUMN id SET DEFAULT nextval('public.persons_id_seq'::regclass);


--
-- Name: id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.privilege ALTER COLUMN id SET DEFAULT nextval('public.privileges_id_seq'::regclass);


--
-- Name: id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.registry_of_contract ALTER COLUMN id SET DEFAULT nextval('public.registry_of_contracts_id_seq'::regclass);


--
-- Name: id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.system_user ALTER COLUMN id SET DEFAULT nextval('public.system_users_id_seq'::regclass);


--
-- Data for Name: company; Type: TABLE DATA; Schema: public; Owner: root
--

INSERT INTO public.company (id, name) VALUES (1, 'БТЛЦ');
INSERT INTO public.company (id, name) VALUES (2, 'ТЛЦ');
INSERT INTO public.company (id, name) VALUES (3, 'Колядичи');


--
-- Name: company_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.company_id_seq', 15, true);


--
-- Data for Name: debitor; Type: TABLE DATA; Schema: public; Owner: root
--

INSERT INTO public.debitor (id, subdivisions, debitor, date_of_occurrence, principal_amount, sent_date, amount_claimed, date_of_debit, redemption_amount, balance_owed, redemption_measures) VALUES (1, 'test1', 'test2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO public.debitor (id, subdivisions, debitor, date_of_occurrence, principal_amount, sent_date, amount_claimed, date_of_debit, redemption_amount, balance_owed, redemption_measures) VALUES (3, '43', 'test2', 'test3', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO public.debitor (id, subdivisions, debitor, date_of_occurrence, principal_amount, sent_date, amount_claimed, date_of_debit, redemption_amount, balance_owed, redemption_measures) VALUES (2, '32', 'test2', 'test3', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO public.debitor (id, subdivisions, debitor, date_of_occurrence, principal_amount, sent_date, amount_claimed, date_of_debit, redemption_amount, balance_owed, redemption_measures) VALUES (4, 'test1', 'test2', 'test3', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO public.debitor (id, subdivisions, debitor, date_of_occurrence, principal_amount, sent_date, amount_claimed, date_of_debit, redemption_amount, balance_owed, redemption_measures) VALUES (5, 'test1', 'test2', 'test3', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO public.debitor (id, subdivisions, debitor, date_of_occurrence, principal_amount, sent_date, amount_claimed, date_of_debit, redemption_amount, balance_owed, redemption_measures) VALUES (7, 'rtg', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO public.debitor (id, subdivisions, debitor, date_of_occurrence, principal_amount, sent_date, amount_claimed, date_of_debit, redemption_amount, balance_owed, redemption_measures) VALUES (9, 'test1', 'test2', 'test3', 'test4', 'data', NULL, NULL, NULL, NULL, NULL);


--
-- Name: debitors_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.debitors_id_seq', 14, true);


--
-- Data for Name: email_detail; Type: TABLE DATA; Schema: public; Owner: root
--

INSERT INTO public.email_detail (id, name) VALUES (1, 'lk@tut.by');


--
-- Name: email_detail_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.email_detail_id_seq', 2, true);


--
-- Data for Name: person; Type: TABLE DATA; Schema: public; Owner: root
--

INSERT INTO public.person (id, name, company_id, famaly, email_detail_id) VALUES (3, 'Зоечка', 2, 'Олегов', NULL);
INSERT INTO public.person (id, name, company_id, famaly, email_detail_id) VALUES (2, 'Олечка', 1, 'Петрова', NULL);
INSERT INTO public.person (id, name, company_id, famaly, email_detail_id) VALUES (5, 'Сергей', 3, 'Панов', NULL);
INSERT INTO public.person (id, name, company_id, famaly, email_detail_id) VALUES (4, 'Вадим', 2, 'Авакиана', NULL);
INSERT INTO public.person (id, name, company_id, famaly, email_detail_id) VALUES (1, 'Аллочка', 1, 'Иванова', NULL);
INSERT INTO public.person (id, name, company_id, famaly, email_detail_id) VALUES (6, 'ваня', 1, 'Мванко', NULL);


--
-- Name: persons_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.persons_id_seq', 6, true);


--
-- Data for Name: privilege; Type: TABLE DATA; Schema: public; Owner: root
--

INSERT INTO public.privilege (id, name) VALUES (1, 'Admin');
INSERT INTO public.privilege (id, name) VALUES (2, 'User');


--
-- Name: privileges_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.privileges_id_seq', 2, true);


--
-- Data for Name: registry_of_contract; Type: TABLE DATA; Schema: public; Owner: root
--

INSERT INTO public.registry_of_contract (id, number_of_contract, name_of_counterparty, conclusion_date, validity_date, subject_contract, amount_contract, settlement_procedure, executor, note) VALUES (1, NULL, 'test2', 'data', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO public.registry_of_contract (id, number_of_contract, name_of_counterparty, conclusion_date, validity_date, subject_contract, amount_contract, settlement_procedure, executor, note) VALUES (2, NULL, 'test2', 'data', NULL, NULL, NULL, NULL, NULL, NULL);


--
-- Name: registry_of_contracts_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.registry_of_contracts_id_seq', 7, true);


--
-- Data for Name: system_user; Type: TABLE DATA; Schema: public; Owner: root
--

INSERT INTO public.system_user (id, name, family, e_mail, gender, password, home_region_country, home_region_city, payment_country, payment_city) VALUES (1, NULL, NULL, 'vinty@i.ua', NULL, '12345', NULL, NULL, NULL, NULL);
INSERT INTO public.system_user (id, name, family, e_mail, gender, password, home_region_country, home_region_city, payment_country, payment_city) VALUES (2, NULL, NULL, 'vinty@i.ua', NULL, '12345', NULL, NULL, NULL, NULL);
INSERT INTO public.system_user (id, name, family, e_mail, gender, password, home_region_country, home_region_city, payment_country, payment_city) VALUES (13, NULL, 'Зыскунов', 'lk@i.ua', NULL, '222', NULL, NULL, NULL, NULL);
INSERT INTO public.system_user (id, name, family, e_mail, gender, password, home_region_country, home_region_city, payment_country, payment_city) VALUES (20, NULL, 'Зыскунов', 'lk@i.ua', NULL, '222', NULL, NULL, NULL, NULL);
INSERT INTO public.system_user (id, name, family, e_mail, gender, password, home_region_country, home_region_city, payment_country, payment_city) VALUES (21, NULL, 'Зыскунов', 'lk@i.ua', NULL, '222', NULL, NULL, NULL, NULL);
INSERT INTO public.system_user (id, name, family, e_mail, gender, password, home_region_country, home_region_city, payment_country, payment_city) VALUES (22, NULL, 'Зыскунов', 'lk@i.ua', NULL, '222', NULL, NULL, NULL, NULL);
INSERT INTO public.system_user (id, name, family, e_mail, gender, password, home_region_country, home_region_city, payment_country, payment_city) VALUES (29, NULL, 'Зыскунов', 'lk@i.ua', NULL, '222', NULL, NULL, NULL, NULL);
INSERT INTO public.system_user (id, name, family, e_mail, gender, password, home_region_country, home_region_city, payment_country, payment_city) VALUES (30, NULL, 'Зыскунов', 'lk@i.ua', NULL, '222', NULL, NULL, NULL, NULL);
INSERT INTO public.system_user (id, name, family, e_mail, gender, password, home_region_country, home_region_city, payment_country, payment_city) VALUES (31, NULL, 'Зыскунов', 'lk@i.ua', NULL, '222', NULL, NULL, NULL, NULL);


--
-- Name: system_users_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.system_users_id_seq', 34, true);


--
-- Data for Name: users_privilege; Type: TABLE DATA; Schema: public; Owner: root
--

INSERT INTO public.users_privilege (user_id, privilege_id) VALUES (1, 1);
INSERT INTO public.users_privilege (user_id, privilege_id) VALUES (2, 2);
INSERT INTO public.users_privilege (user_id, privilege_id) VALUES (1, 2);
INSERT INTO public.users_privilege (user_id, privilege_id) VALUES (2, 1);
INSERT INTO public.users_privilege (user_id, privilege_id) VALUES (13, 1);
INSERT INTO public.users_privilege (user_id, privilege_id) VALUES (13, 2);


--
-- Name: company_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.company
    ADD CONSTRAINT company_pkey PRIMARY KEY (id);


--
-- Name: debitors_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.debitor
    ADD CONSTRAINT debitors_pkey PRIMARY KEY (id);


--
-- Name: email_detail_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.email_detail
    ADD CONSTRAINT email_detail_pkey PRIMARY KEY (id);


--
-- Name: persons_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.person
    ADD CONSTRAINT persons_pkey PRIMARY KEY (id);


--
-- Name: privilege_pk; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.privilege
    ADD CONSTRAINT privilege_pk PRIMARY KEY (id);


--
-- Name: registry_of_contracts_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.registry_of_contract
    ADD CONSTRAINT registry_of_contracts_pkey PRIMARY KEY (id);


--
-- Name: system_user_pk; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.system_user
    ADD CONSTRAINT system_user_pk PRIMARY KEY (id);


--
-- Name: users_privileges_user_id_privilege_id_pk; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.users_privilege
    ADD CONSTRAINT users_privileges_user_id_privilege_id_pk PRIMARY KEY (user_id, privilege_id);


--
-- Name: person_email_detail_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.person
    ADD CONSTRAINT person_email_detail_id_fk FOREIGN KEY (email_detail_id) REFERENCES public.email_detail(id);


--
-- Name: persons_company_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.person
    ADD CONSTRAINT persons_company_id_fk FOREIGN KEY (company_id) REFERENCES public.company(id);


--
-- Name: users_privileges_privileges_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.users_privilege
    ADD CONSTRAINT users_privileges_privileges_id_fk FOREIGN KEY (privilege_id) REFERENCES public.privilege(id);


--
-- Name: users_privileges_system_user_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.users_privilege
    ADD CONSTRAINT users_privileges_system_user_id_fk FOREIGN KEY (user_id) REFERENCES public.system_user(id);


--
-- Name: SCHEMA public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

