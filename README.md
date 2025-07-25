# 📱 Clean Architecture Cryptocurrency App

A modern Android application demonstrating **Clean Architecture**, **MVVM**, **Use Cases**, and **Jetpack Compose** — using a real cryptocurrency API.

---

## 🧱 Архитектура

Проект построен на основе **Clean Architecture** с четким разделением на слои:

Presentation (UI) 👁️
⬇
Domain (Use Cases, Entities) ⚙️
⬇
Data (Repository, DTOs, API) 🌐

### 🔄 Поток данных

UI → ViewModel → UseCase → Repository → Remote API

---

## 🧰 Используемые технологии

| Категория           | Технологии                                |
|---------------------|--------------------------------------------|
| Язык                | Kotlin                                     |
| UI-фреймворк        | Jetpack Compose                            |
| Архитектура         | MVVM + Clean Architecture                  |
| Dependency Injection| Dagger-Hilt                                |
| Сетевые запросы     | Retrofit                                   |
| Асинхронность       | Kotlin Coroutines, Flow                    |
| Обработка ошибок    | Sealed классы / Resource wrapper           |
| JSON-сериализация   | Gson                                       |
| Навигация           | Navigation-Compose                         |

---

## 🚀 Возможности приложения

- 📈 Отображение списка криптовалют с актуальной информацией
- 🔍 Детальный экран каждой валюты
- ✅ UI-состояния: загрузка, ошибка, контент
- 🎨 Современный UI на Jetpack Compose

---

🔐 API
Приложение использует публичный API от CoinPaprika. Регистрация не требуется.
