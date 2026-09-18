# The Logpulse-cli
### Programming in Java - Evaluated Project | VITyarthi

# LogPulse CLI is a lightweight, zero-dependency DevOps telemetry tool built in pure Java SE. Designed for system administrators and Site Reliability Engineers (SREs), it transforms raw, unstructured server logs into actionable operational metrics. By operating entirely within the terminal, LogPulse provides lightning-fast log parsing, real-time health analytics, and local incident ticketing without the resource overhead or network latency of heavy graphical cloud dashboards.

# LogPulse CLI 

![Java](https://img.shields.io/badge/Java-SE_8%2B-blue?style=for-the-badge&logo=java)
![Interface](https://img.shields.io/badge/Interface-CLI-black?style=for-the-badge&logo=powershell)
![Architecture](https://img.shields.io/badge/Architecture-MVC-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-orange?style=for-the-badge)

> A lightweight, zero-dependency command-line DevOps telemetry tool written in pure Java SE.

LogPulse bridges the gap between raw, unstructured server data and rapid operational decision-making. Developed to apply foundational and advanced techniques from the **Programming in Java** course, this tool allows system administrators and Site Reliability Engineers (SREs) to parse logs, analyze system health, and manage incident tickets directly from the terminal without the overhead of heavy graphical dashboards.

---

## 📑 Table of Contents
1. [About The Project](#about-the-project)
2. [Core Features](#core-features)
3. [System Architecture](#system-architecture)
4. [Getting Started](#getting-started)
5. [Usage Guide](#usage-guide)
6. [Directory Structure](#directory-structure)
7. [Roadmap](#roadmap)
8. [License](#license)

---

## 🚀 About The Project

Modern production systems continuously produce vast amounts of unstructured text logs. When a critical failure occurs, operators require immediate triage capabilities. Traditional enterprise log-management solutions rely on resource-heavy web interfaces that introduce latency and require complex configurations. 

**LogPulse** eliminates these friction points by providing a highly localized, terminal-native application. It allows operators to instantly triage server health and track remediation efforts entirely within a headless server environment.

### Built With
*   **Java SE (Standard Edition)** - Core language and runtime.
*   **Java Streams API** - For high-performance data aggregation.
*   **Java Regex (`java.util.regex`)** - For tokenizing unstructured text.

---

## ✨ Core Features

*   **High-Speed Log Ingestion:** Parses standard server log files using optimized Regular Expressions, safely isolating malformed lines without crashing.
*   **Real-Time Telemetry:** Aggregates log severity levels (`INFO`, `WARN`, `ERROR`, `CRITICAL`) and isolates microservices experiencing high error rates.
*   **Incident Ticketing (CRUD):** A built-in ticketing system allows operators to flag critical anomalies, create trackable incidents, and resolve them dynamically.
*   **Zero Dependencies:** Runs on base JVMs with no need for external libraries, Maven, or Spring configurations.
*   **Flat-File Persistence:** Saves and tracks all incident tickets locally via lightweight `.csv` storage, surviving application restarts.

---

## 🏗 System Architecture

LogPulse follows a strict N-Tier layered architecture to ensure maintainability and separation of concerns:

1.  **Presentation Layer (`ui`, `LogPulseApp`):** Standard I/O CLI UI utilizing `Scanner` and ASCII formatting.
2.  **Service & Domain Layer (`parser`, `analytics`):** The business logic engine utilizing Java Streams and Pattern Matching.
3.  **Repository Layer (`repository`):** Data access and file manipulation utilizing defensive `Try-With-Resources` blocks.
4.  **Storage (`data`):** Local disk flat-files (`server.log` and `incidents.csv`).

---

## 💻 Getting Started

### Prerequisites
*   **Java Development Kit (JDK):** Version 8 or higher installed and added to your system PATH.
*   **Terminal:** Windows PowerShell, Linux Bash, or macOS Terminal.

### Installation

1. Clone the repository to your local machine:
   ```powershell
   git clone [https://github.com/yuvrajjain9988-collab/logpulse-cli.git](https://github.com/yuvrajjain9988-collab/logpulse-cli.git)
