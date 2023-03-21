CREATE SEQUENCE hibernate_sequence START 1 INCREMENT 1;

insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (null, 'martin', 'martin@fastcampus.com', now(), now());

insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (null, 'dennis', 'dennis@fastcampus.com', now(), now());

insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (null, 'sophia', 'sophia@slowcampus.com', now(), now());

insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (null, 'james', 'james@slowcampus.com', now(), now());

insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (null, 'martin', 'martin@another.com', now(), now());
