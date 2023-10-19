FROM ubuntu:latest
LABEL authors="mathv"

ENTRYPOINT ["top", "-b"]