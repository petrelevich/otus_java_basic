#!/bin/sh

docker run \
  -p 5432:5432 \
  -e POSTGRES_PASSWORD=postgres \
  -e POSTGRES_DB=otus \
  -v "$(pwd)/init_db":/docker-entrypoint-initdb.d \
  -d \
  --name my_postgres \
  postgres:13
