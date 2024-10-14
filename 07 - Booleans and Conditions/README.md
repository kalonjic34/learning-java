# Java Boolean Logic Learning Summary


## Key Concepts Learned

### Boolean Operators

- **Equality and Inequality**: `==`, `!=`
- **Logical NOT**: `!`
- **Logical AND**: `&&`
- **Logical OR**: `||`

### Conditional Statements

- **Nested If Statements**: Used for checking conditions step-by-step.
- **Combined Conditions**: Simplified checks using logical operators.

### Ternary Operator

- **Syntax**: `condition ? trueValue : falseValue`
- **Usage**: Condenses simple if-else logic into a single line.

### Practical Applications

- **Decision Making**: Determining actions based on multiple conditions, such as deciding to take an umbrella.

## Program Structure

### Boolean "And"

```java
boolean isRaining = true;
boolean haveUmbrella = false;
boolean takeUmbrella = false;

if(isRaining && haveUmbrella){
    takeUmbrella = true;
}

System.out.println(takeUmbrella);

takeUmbrella = isRaining && haveUmbrella ? true : false;
```

- **Variables**: 
  - `isRaining`: Indicates if it's raining.
  - `haveUmbrella`: Indicates if you have an umbrella.
  - `takeUmbrella`: Determines if you should take an umbrella.

- **Logic**:
  - Uses the logical AND (`&&`) to check if both conditions are true.
  - Uses the ternary operator to simplify the logic for setting `takeUmbrella`.

### Boolean "Or"

```java
boolean isRaining = true;
boolean mightRain = false;
boolean takeUmbrella = false;

if(isRaining || mightRain){
    takeUmbrella = true;
}

System.out.println(takeUmbrella);
```

- **Variables**:
  - `isRaining`: Indicates if it's raining.
  - `mightRain`: Indicates if it might rain.
  - `takeUmbrella`: Determines if you should take an umbrella.

- **Logic**:
  - Uses the logical OR (`||`) to check if either condition is true.

### Complex Boolean Conditions

```java
boolean isRaining = false;
boolean mightRain = true;
boolean haveUmbrella = true;

if((isRaining || mightRain) && haveUmbrella){
    System.out.println("Take umbrella!");
} else {
    System.out.println("Don't take umbrella");
}
```

- **Variables**:
  - `isRaining`: Indicates if it's raining.
  - `mightRain`: Indicates if it might rain.
  - `haveUmbrella`: Indicates if you have an umbrella.

- **Logic**:
  - Combines logical OR (`||`) and AND (`&&`) to check if you should take an umbrella based on multiple conditions.
  - Prints the appropriate message based on the conditions.
  

These examples demonstrate how to use Boolean logic to make decisions in Java programs.