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

---

<p align="center">
  <img src="https://github.com/user-attachments/assets/8f7430c6-b151-47e9-b500-2d41c2140a0e" alt="cryptoapp_1" width="300" style="display:inline-block; margin-right:10px;" />
  <img src="https://github.com/user-attachments/assets/426711db-3690-4124-94a2-182dc0820006" alt="cryptoapp_2" width="300" style="display:inline-block;" />
</p>


