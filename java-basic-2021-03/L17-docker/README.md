Сборка образа
```bash
docker build -t java-hello-docker:demo .
```

Смотрим список образов
```bash
docker images
```

Запуск контейнера
```bash
docker run java-hello-docker:demo
```
Запуск в интерактивном режиме 
```bash
docker run -it ubuntu bash
```

Остановить и удалить все Docker контейнеры.
```bash
docker stop $(docker ps -a -q) && docker rm $(docker ps -a -q)
```

Удалить все образы
```bash
docker rmi -f $(docker images -a -q)
```