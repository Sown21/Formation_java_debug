# HemeBiotech Analytics

This project analyzes medical symptom data by reading a file, counting occurrences of each symptom, and writing the results to an output file.

## Prerequisites

- Java Development Kit (JDK) version 21
- Git installed on your system
- Terminal or IDE with Java support (IntelliJ IDEA, Eclipse, VS Code, etc.)

## Clone the repository

git clone https://github.com/Sown21/Formation_java_debug

## Compile the project

Compile all Java sources with:

cd Project02Eclipse/

javac -d out src/com/hemebiotech/analytics/*.java

Compiled classes will be placed in the `out/` directory.

## Run the program

Run the main class with:

java -cp out com.hemebiotech.analytics.Main

This will:

1. Read symptoms from `symptoms.txt`
2. Count occurrences of each symptom
3. Write results to `result.out`

## Input example (`symptoms.txt`)

headache
headache
fever
cough
fever


## Output example (`result.out`)

cough: 1
fever: 2
headache: 2



