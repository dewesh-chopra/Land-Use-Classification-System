# Land Use Classification System

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![Java Version](https://img.shields.io/badge/java-19-blue)

The Land Use Classification System is a Java 19-based application designed to classify different types of land use based on input data. It utilizes various technologies such as Cucumber, Selenium, JUnit, and Maven for testing and development.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Clone](#clone)
- [Usage](#usage)
  - [Configuration](#configuration)
  - [Running Tests](#running-tests)
- [Project Structure](#project-structure)
- [Reports](#reports)
- [Contributing](#contributing)

## Introduction

Land use classification is an important task in urban planning, environmental management, and various other fields. This system provides a convenient way to classify land use based on different attributes and criteria.

## Features

- User-friendly CLI interface for input and interaction.
- Data preprocessing for handling various data formats.
- Accurate classification using advanced algorithms.
- Integration of Cucumber for behavior-driven development.
- Selenium for automated user interface testing.
- JUnit for unit testing.
- Maven for build and dependency management.

## Technologies Used

- Java 19
- Cucumber
- Selenium
- JUnit
- Maven

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 19
- Maven

### Clone

Clone the repository:

```bash
git clone https://github.com/dewesh-chopra/Land-Use-Classification-System.git
```

## Usage

### Configuration
Edit the configuration file at src/main/resources/config.properties to customize system behavior, data sources, and other settings.

### Running Tests
UI Tests:
UI tests are written using Selenium and Cucumber.

```
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   ├── example
│   │   │   │   │   ├── landuseclassification
│   │   │   │   │   │   │   ├── ...
│   │   │   │   │   │   ├── *.java
│   │   ├── resources
│   │   │   ├── config.properties
│   │   │   ├── ...

├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   ├── example
│   │   │   │   │   ├── landuseclassification
│   │   │   │   │   │   │   ├── ...
│   │   │   │   │   │   ├── CucumberTestRunner.java
│   │   │   │   │   │   ├── SeleniumUITest.java
│   │   │   │   │   │   ├── ...
```

## Reports
The generated reports can be found in the target directory after running tests. These reports include Cucumber test reports, coverage reports, and other relevant information.

## Contributing
Contributions are welcome! Please follow the contributing guidelines to contribute to this project.
