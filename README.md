Repository to go along with the *How To Secure Your Gradle Credentials In Jenkins* article
at [tomgregory.com](https://www.tomgregory.com).

## Pre-requisites

* Docker
* If you are running it for the first time then use the following command to push Jenkin to popye's docker hub
  ```
  docker build -t popyeindia/popye-jenkins:0.0.1 .
  docker push  popyeindia/popye-jenkins:0.0.1
  ```

## Running

`./gradlew docker dockerComposeUp`

This will run:
* Jenkins
* Archiva

## Stopping

`docker-compose down`

(unfortunately the Palantir Gradle plugin doesn't provide a *dockerComposeDown* task
so we have to run the *docker-compose* command directly)

## Publishing

`./gradlew publish`

This will publish a simple jar file with a single Java class to a locally configured Archiva Maven repository.

## Building

`./gradlew build`

This will try to build the `project-to-build` project. It has a dependency on an artifact that it expects to be
in a locally configured Archiva Maven repository.