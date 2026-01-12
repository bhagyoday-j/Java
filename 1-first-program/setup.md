

## Part 1: Install Java (JDK) on Windows 11

Java programs need **JDK (Java Development Kit)**.

### Step 1: Download JDK

1. Open browser
2. Go to 👉 [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)
3. Under **Java SE**, download:

   * **Windows x64 Installer (.exe)**

*(You can also use OpenJDK, but Oracle JDK is easiest for beginners.)*

---

### Step 2: Install JDK

1. Double-click the downloaded `.exe` file
2. Click **Next → Next → Install**
3. Finish installation

By default, Java installs in:

```
C:\Program Files\Java\jdk-<version>
```

---

### Step 3: Verify Java Installation

1. Press **Windows + R**
2. Type `cmd` → press Enter
3. Type:

```bash
java -version
```

If Java is installed correctly, you will see output like:

```
java version "21"
```

✅ Java installed successfully

---

## Part 2: Set Environment Variable (IMPORTANT)

If `java -version` does **not work**, do this:

### Step 1: Open Environment Variables

1. Search **"Environment Variables"** in Start
2. Click **Edit the system environment variables**
3. Click **Environment Variables**

---

### Step 2: Set JAVA_HOME

1. Click **New** under *System Variables*
2. Enter:

   * Variable name: `JAVA_HOME`
   * Variable value:

     ```
     C:\Program Files\Java\jdk-<version>
     ```

---

### Step 3: Add Java to PATH

1. Select **Path** → Click **Edit**
2. Click **New**
3. Add:

   ```
   %JAVA_HOME%\bin
   ```
4. Click **OK → OK → OK**

Restart **Command Prompt** and run:

```bash
java -version
```

---

## Part 3: Write Your First Java Program

### Step 1: Create a Folder

1. Create a folder anywhere (example):

```
C:\JavaPrograms
```

---

### Step 2: Create Java File

1. Open **Notepad**
2. Paste this code 👇

```java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

3. Click **File → Save As**
4. File name:

```
HelloWorld.java
```

5. Save type:

```
All Files
```

6. Save inside:

```
C:\JavaPrograms
```

⚠️ File name **must match class name**

---

## Part 4: Compile and Run Java Program

### Step 1: Open Command Prompt

```bash
cd C:\JavaPrograms
```

---

### Step 2: Compile Java Code

```bash
javac HelloWorld.java
```

If no error → compiled successfully
This creates:

```
HelloWorld.class
```

---

### Step 3: Run Java Program

```bash
java HelloWorld
```

Output:

```
Hello, World!
```

🎉 You just ran your first Java program!

---

## Part 5: Common Errors (Very Important)

### ❌ Error: `javac is not recognized`

✔ Java not added to PATH → redo **Environment Variables**

---

### ❌ Error: `class not found`

✔ Run command **without `.java`**

```bash
java HelloWorld
```

---

### ❌ Error: file name mismatch

✔ Class name and file name must be **same**

---

## Optional (Recommended): Use an IDE

Instead of Notepad, use:

* **IntelliJ IDEA (Best for Java)**
* **Eclipse**
* **VS Code + Java Extension**

