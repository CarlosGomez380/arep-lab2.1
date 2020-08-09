# AREP - LAB 1

A program to calculate the mean and standard deviation of a set of n real numbers. The program reads the n real numbers from a file.

## Getting Started

### Pre-requisites

You need to have installed on your PC:

- JDK 
- Maven 
- Git

### Installing

Open a command prompt on the folder that you are going to save this project and copy:

```
git clone https://github.com/CarlosGomez380/arep-lab1.git
```

Once finish this process, open the project on the terminal with 

```
cd arep-lab1
```

And copy:

```
mvn package
```

## Running the tests

To run test, open the folder of this project and a command prompt on this location and copy:

```
mvn test
```

## Deployment

To deploy this project open the folder of this project and a command prompt on this location and copy:

```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.lab1.App"
```

## Built With

- [Maven](https://maven.apache.org/) - Dependency Management

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
