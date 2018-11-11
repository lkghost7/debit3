-- we don't know how to generate database hibernate (class Database) :(
create table if not exists system_user
(
	id serial not null
		constraint system_user_pk
			primary key,
	name varchar(40),
	family varchar(40),
	e_mail varchar(40) not null,
	gender varchar(20),
	password varchar(255) not null,
	home_region_country varchar(40),
	home_region_city varchar(40),
	payment_country varchar(40),
	payment_city varchar(40)
)
;

create table if not exists privilege
(
	id serial not null
		constraint privilege_pk
			primary key,
	name varchar(20) not null
)
;

create table if not exists users_privilege
(
	user_id integer not null
		constraint users_privileges_system_user_id_fk
			references system_user,
	privilege_id integer not null
		constraint users_privileges_privileges_id_fk
			references privilege,
	constraint users_privileges_user_id_privilege_id_pk
		primary key (user_id, privilege_id)
)
;

create table if not exists registry_of_contract
(
	id bigserial not null
		constraint registry_of_contracts_pkey
			primary key,
	number_of_contract varchar(200),
	name_of_counterparty varchar(200),
	conclusion_date varchar(200),
	validity_date varchar(200),
	subject_contract varchar(200),
	amount_contract varchar(200),
	settlement_procedure varchar(200),
	executor varchar(200),
	note varchar(200)
)
;

create table if not exists debitor
(
	id serial not null
		constraint debitors_pkey
			primary key,
	subdivisions varchar(200),
	debitor varchar(200),
	date_of_occurrence varchar(200),
	principal_amount varchar(200),
	sent_date varchar(200),
	amount_claimed varchar(200),
	date_of_debit varchar(200),
	redemption_amount varchar(200),
	balance_owed varchar(200),
	redemption_measures text
)
;

create table if not exists company
(
	id serial not null
		constraint company_pkey
			primary key,
	name varchar(200)
)
;

create table if not exists email_detail
(
	id serial not null
		constraint email_detail_pkey
			primary key,
	name varchar(200)
)
;

create table if not exists person
(
	id serial not null
		constraint persons_pkey
			primary key,
	name varchar(200),
	company_id integer
		constraint persons_company_id_fk
			references company,
	famaly varchar(200),
	email_detail_id integer
		constraint person_email_detail_id_fk
			references email_detail
)
;

