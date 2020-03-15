# Metor Path Finder Application
## Kotlin Program that determines and prints out the DC Metro stops between Foggy Bottom and `destinationCode`. 

### Specifications
`pathFromFoggyBottom` function:
- The function takes one parameter `destinationCode`.
- The function should determine if there is a Metro path between **Foggy Bottom (C04)** and the station with `destinationCode`.
- If a path exists, the function must print:
  - The **station name** of the destination.
  - The **Metro line** (e.g. _Silver_, _Orange_, or _Blue_)
  - The **list of stations**, in order, on the path from Foggy Bottom to the destination (inclusive).
  - The **direction** of the train on the line, which is denoted by the final station of the line. For example, from Foggy Bottom, a given Silver line train goes in the direction either towards _Wiehle-Reston East_ or _Largo Town Center_.
- If multiple path exists, any single path is chosen to output.

- Support the scenario where the destination station / path _doesn't exist_ (print some kind of error message).
- Support the scenario where the destination station _is_ Foggy Bottom (e.g. no need to take the Metro).
