# Scala Generic Class Type Mismatch
This repository demonstrates a common type mismatch error encountered when working with generic classes in Scala, specifically when using a List as a type parameter.

## Problem Description
The `MyClass` generic class is designed to hold a value of type `T`. When instantiating this class with an `Int`, a `String`, or a `List`, the `printValue` method works correctly for `Int` and `String`. However, a type mismatch error occurs when using a `List` as the type parameter. This is because Scala's type inference might not always choose the most specific type, potentially leading to unexpected behavior with collection types.

## Solution
The provided solution addresses the issue by explicitly specifying the type parameter `T` during instantiation of `MyClass` whenever a `List` is used, thereby resolving any ambiguity in the type system.