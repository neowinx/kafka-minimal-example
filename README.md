# Kafka

Simple producer consumer kafka example.
I made this for my own reference in the future

## Requirements

- [Kafka](https://kafka.apache.org/)
- [Java 8+](https://openjdk.java.net/install/)
- [SBT](https://www.scala-sbt.org/)

## Usage

- Spin your local Kafka instance using
  [ this ](https://kafka.apache.org/quickstart#quickstart_startserver) instructions

- Run the consumer

```bash
cd consumer
sbt "run"
```

- Run the producer

```bash
cd producer
sbt "run"
```
