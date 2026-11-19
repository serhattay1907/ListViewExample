# 📋 ListView Example (Android · Java)

Small Android app demonstrating the two common ways to populate a `ListView`:

- **ArrayAdapterActivity** — a simple list using the built-in `ArrayAdapter`
- **CustomAdapterActivity** — a custom `AnimalAdapter` (extends `BaseAdapter`) that renders a model class (`Animal`) with a custom row layout

## ▶️ Run
Open the project in **Android Studio**, let Gradle sync, then run on an emulator or device.

**Requirements:** Android Studio · JDK 17 · min SDK 24 · target/compile SDK 36

## 📂 Structure
| File | Role |
|---|---|
| `MainActivity.java` | Entry screen, opens the two examples |
| `ArrayAdapterActivity.java` | Built-in `ArrayAdapter` list |
| `CustomAdapterActivity.java` | List with the custom adapter |
| `AnimalAdapter.java` | `BaseAdapter` subclass, inflates `listview_row.xml` |
| `Animal.java` | Model class |
