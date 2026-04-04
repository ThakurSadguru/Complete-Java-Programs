# 📘 HashMap Basics in Java

## 🔹 What is HashMap?

`HashMap` is a class in Java that stores data in **key-value pairs**.

- Each key is unique
- Each key maps to one value
- No order is guaranteed

---

## 🔹 Syntax

### 1. Import

```java
import java.util.HashMap;
```

### 2. Declaration

```java
HashMap<KeyType, ValueType> map = new HashMap<>();
```

### Example:

```java
HashMap<Character, Integer> map = new HashMap<>();
```

---

## 🔹 Common Methods

### ➤ 1. put() – Add or Update

```java
map.put(key, value);
```

- Adds a new key-value pair
- Updates value if key already exists

---

### ➤ 2. get() – Retrieve Value

```java
map.get(key);
```

- Returns value of the key
- Returns `null` if key not found

---

### ➤ 3. getOrDefault() – Safe Retrieval

```java
map.getOrDefault(key, defaultValue);
```

- Returns value if key exists
- Otherwise returns default value

---

### ➤ 4. containsKey() – Check Key

```java
map.containsKey(key);
```

- Returns `true` if key exists

---

### ➤ 5. remove() – Delete Entry

```java
map.remove(key);
```

---

### ➤ 6. size() – Number of Elements

```java
map.size();
```

---

## 🔹 Looping Through HashMap

### ➤ Using keySet()

```java
for (Character key : map.keySet()) {
    System.out.println(key + " -> " + map.get(key));
}
```

---

### ➤ Using entrySet() (Best way)

```java
for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

---

## 🔹 Example: Character Frequency

```java
String str = "banana";

HashMap<Character, Integer> map = new HashMap<>();

for (char ch : str.toCharArray()) {
    map.put(ch, map.getOrDefault(ch, 0) + 1);
}

System.out.println(map);
```

### ✅ Output:

```
{b=1, a=3, n=2}
```

---

## 🔹 Key Points to Remember

- Keys must be **unique**
- Values can be duplicate
- `HashMap` is **not ordered**
- Allows one `null` key
- Time Complexity: **O(1)** for most operations

---

## 🔹 Use Cases

- Counting frequency (like characters, numbers)
- Storing mappings (ID → Name)
- Caching data
- Fast lookup operations

---

## ✅ Summary

`HashMap` is a powerful data structure used for:

- Fast data storage
- Quick lookup
- Efficient counting problems

---
