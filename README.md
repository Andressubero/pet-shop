# pet-shop

# 🐶 Pet-Shop

Aplicación Android desarrollada en Kotlin que permite a los usuarios autenticarse (es un mock),
explorar productos y gestionar su carrito de compras. Se conecta a una API REST pública y utiliza 
buenas prácticas como arquitectura limpia, inyección de dependencias y almacenamiento local.

---

## 🚀 Funcionalidades

- 🔐 **Login de usuario** (API: `https://dummyjson.com/auth/login`)
- 🛍️ **Listado de productos**
- - 🛍️ **Listado de favoritos**
- 🧺 **Carrito de compras**
- 🔄 **Consumo de API REST con Retrofit**
- 💾 **Persistencia local con Room (para los favoritos)**
- 💉 **Inyección de dependencias con Hilt**

---

## 🛠️ Tecnologías utilizadas

- **Kotlin**
- **Retrofit** – para consumo de APIs REST
- **Room** – base de datos local
- **Hilt** – inyección de dependencias
- **ViewModel StateFlow** 
- **Coroutines** – para llamadas asincrónicas

---

## 🔗 API utilizada

La app utiliza [DummyJSON](https://dummyjson.com/) como backend falso para simular funcionalidades reales:

- Autenticación: `/auth/login`
- Carrito de compras: `/carts/1`
- Productos: `/products`

---

## 📱 Cómo correr la app

1. Cloná el repositorio:
   ```bash
   git clone https://github.com/Andressubero/pet-shop.git



