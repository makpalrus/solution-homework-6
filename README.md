# Homework 6

This project showcases two essential behavioral design patterns — **Chain of Responsibility** and **Command** — implemented in Java. These patterns are widely used in enterprise-grade backend systems and real-time UI frameworks.

---

## Part 1: Chain of Responsibility — Tech Support Request Handler

### Description

Implements a support ticket system where each level of support (FAQ bot, junior support, senior engineer) attempts to handle a user issue. If a handler cannot resolve the issue, it delegates to the next one in the chain.

### Components

- `SupportHandler` — Abstract base class for all handlers
- `FAQBotHandler` — Handles simple issues like `password_reset`
- `JuniorSupportHandler` — Handles `refund_request`, `billing_issue`
- `SeniorSupportHandler` — Handles `account_ban`, `data_loss`

###  Sample Execution

```
[FAQBot] Handled password_reset
[JuniorSupport] Handled refund_request
[SeniorSupport] Handled account_ban
[SeniorSupport] Cannot handle unknown_bug — escalate manually
```

## Part 2: Smart Home Remote Control — Command Pattern 

This project demonstrates the **Command Design Pattern** with an advanced **Smart Home Remote Control** system.  
Includes **Logging** and an **Undo Stack** for full command tracking and reversibility.


---

## Architecture

- **Command Interface**: defines `execute()` and `undo()`
- **Concrete Commands**: `TurnOnLightCommand`, `SetThermostatCommand`
- **Receivers**: `Light`, `Thermostat`
- **Invoker**: `SmartHomeRemoteControl`
- **Logger**: tracks every operation with timestamp
- **Undo Stack**: enables rollback of actions

---
---

## Why This Pattern?

- **Decouples logic**: buttons know nothing about device internals
- **Flexible architecture**: easily extendable for more devices or commands
- **Supports history**: actions can be undone or re-executed
- **Testing & Debugging**: built-in logger shows full command trace




