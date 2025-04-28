# excel_min

Сервис:

1. Принимает на вход путь к локальному `.xlsx`-файлу и число N.  
2. Считывает все целые числа из первого столбца.  
3. Находит N-е минимальное число (используется алгоритм QuickSort — среднее время O(n log n)).  
4. Возвращает результат в JSON.  

---

## Сборка

```bash
git clone https://github.com/soklenxx/excel_min.git
cd excel_min
mvn clean package
```

После сборки артефакт будет в `target/excel_min-0.0.1-SNAPSHOT.jar`.

---

## Запуск

```bash
# Запуск собранного JAR
java -jar target/excel_min-0.0.1-SNAPSHOT.jar

# Или через Maven
mvn spring-boot:run
```

## Swagger / OpenAPI

Документация доступна:

- UI: `http://localhost:8080/swagger-ui/index.html`  
- JSON-схема: `http://localhost:8080/v3/api-docs`  

---

## Идеи для улучшений

- Валидация пути и формата файла — подробные сообщения об ошибках.  
- Улучшение алгоритма сортировки до сложности O(n) QuickSelect или через максимальную кучу для оптимизации памяти
- Централизованная обработка ошибок (`@ControllerAdvice`).
