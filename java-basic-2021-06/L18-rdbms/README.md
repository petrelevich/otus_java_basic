# Postgres + PgAdmin4 в docker

PostgreSQL с PgAdmin4 разворачивается в Docker через `docker-compose`.

Очень кратко:
* `cd <эта_директория>`
* `docker-compose up -d`
* Доступ к PgAdmin 4
    * http://localhost:9090 (Linux, Windows Docker **Desktop**) \
      или
    * http://192.168.99.104:9090 (Windows Docker **Toolbox**, IP может быть другой - посмотреть можно через `docker-machine ip`)
* PostgreSQL снаружи на порту `5432`
* PostgreSQL логин `postgres`, пароль `postgres`

Про Docker немного подробнее ниже.

## Docker

Установите `docker` и `docker-compose`. 

* Linux - https://docs.docker.com/engine/install/
* Windows 10 Pro, Enterprise - https://docs.docker.com/docker-for-windows/install/
* Windows (**кроме** 10 Pro, Enterprise) - https://docs.docker.com/docker-for-windows/docker-toolbox/
* docker-compose - https://docs.docker.com/compose/install/

## Запуск, останов

Перейдите в каталог с этим файлом (`cd <эта_директория>`)

Запуск:
```bash
docker-compose up -d
```

Если вносились изменения в образы, то добавить `--build`:
```bash
docker-compose up -d --build
```

Проверить, что запустилось:
```bash
docker ps
```

Должно быть два контейнера:  `otus-postgres` и `otus-pgadmin`.

Останов:
```bash
docker-compose down
```

## Подключение к БД

PgAdmin 4 запускается в контейнере.

Вход в PgAdmin http://locahost:9090 

Для Windows Docker Toolbox имя хоста будет не `localhost`. 
Посмотрите ваш IP: 
```bash
docker-machine ip
192.168.99.104
```

Т.е. будет http://192.168.99.104:9090

Подключение из PgAdmin в docker к Postgres (там уже должно быть сконфигурировано подключение):
* Сервер Postgres - `otus-postgres`
* Логин - `postgres`
* Пароль -  `postgres`
* Порт - `5432`

## Полезные команды docker

Остановить и удалить все Docker контейнеры.
```bash
docker stop $(docker ps -a -q) && docker rm $(docker ps -a -q)
```

Подключиться внутрь контейнера.
```bash
docker exec -i -t otus-postgres sh
```
