# SBT Web Project

[g8](http://github.com/n8han/giter8) template for the same stuff I put in every
sbt web project

## Contents

Includes [codahale][coda]'s [assembly-sbt](http://github.com/codahale/assembly-sbt)
sbt plugin for building and deploying fat jars.

The web project includes references to [Jersey 1.4](https://jersey.dev.java.net/),
[Apache Velocity 1.6.4](http://velocity.apache.org/) and
[simple-velocity 0.3.0](http://github.com/bryanjswift/simple-velocity). Additionally,
Jetty 6.1.26 and [ScalaTest 1.2](http://www.scalatest.org/) are included for testing.

## Configuration

Uses [codahale][coda]'s [fig](http://github.com/codahale/fig) project for configuration.

## Install

Assuming g8 is installed:

    mkdir my-project && cd my-project
    g8 bryanjswift/sbt-project
    mv gitignore .gitignore
    sbt update

If g8 is not installed please see [readme for g8](http://github.com/n8han/giter8#readme)

[coda]:http://github.com/codahale
