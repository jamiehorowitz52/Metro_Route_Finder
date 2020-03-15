# CSCI 4237 - Homework 2 - Kotlin Exercise
## Purpose
Practice using the Kotlin programming language and get comfortable reading language documentation & code examples, which will also come in handy as we move into learning Android.

The data used in this assignment (Metro station names and Metro station codes (IDs))
comes from the [WMATA API](https://developer.wmata.com/) and many of their APIs actually use the unique station codes to refer to specific stations, rather than the stations' names that we are
more familiar with. e.g. the problem you are asked to solve is somewhat realistic :)

## Assignment
Set up a Kotlin environment:
- You can use the online playground that we used in Lecture 1: [play.kotlinlang.com](https://play.kotlinlang.org/) and replace the default
program with the contents of `homework2.kt`.
- Or, you can install (or update) IntelliJ and [use the IDE](https://kotlinlang.org/docs/tutorials/getting-started.html) to do Kotlin development. Either import `homework2.kt` into IntelliJ, or create a new Kotlin project and paste the code in.

Use `git` to clone this repository to your local machine. You'll need to push your final code
back up to this repo in a new branch and make a Pull Request (see the Submission section).

### Reading Material
This assignment will require you to review the [Kotlin language documentation](https://kotlinlang.org/docs/reference/) and self-teach some of the language's features and syntax. I will be using Kotlin all semester and will be explaining new topics as they arise, but the best way to learn a new language is to use it naturally (and don't be afraid to ask questions on Slack!).

Here's a few links to some relevant documentation:

https://kotlinlang.org/docs/reference/
https://kotlinlang.org/docs/reference/basic-syntax.html
https://kotlinlang.org/docs/reference/basic-types.html
https://kotlinlang.org/docs/reference/control-flow.html
https://kotlinlang.org/docs/reference/collections-overview.html
https://kotlinlang.org/docs/reference/iterators.html
https://kotlinlang.org/docs/reference/collection-elements.html
https://kotlinlang.org/docs/reference/functions.html
https://kotlinlang.org/docs/reference/lambdas.html

### Primary Requirements
Fill out the contents of the `pathFromFoggyBottom` function:
- The function takes one parameter `destinationCode`.
- The function should determine if there is a Metro path between **Foggy Bottom (C04)** and the station with `destinationCode`.
- If a path exists, the function must print:
  - The **station name** of the destination.
  - The **Metro line** (e.g. _Silver_, _Orange_, or _Blue_)
  - The **list of stations**, in order, on the path from Foggy Bottom to the destination (inclusive).
  - The **direction** of the train on the line, which is denoted by the final station of the line. For example, from Foggy Bottom, a given Silver line train goes in the direction either towards _Wiehle-Reston East_ or _Largo Town Center_.
- If multiple path exists, you can choose any single path to output.

### Secondary Requirements
- You must support the scenario where the destination station / path _doesn't exist_ (print some kind of error message).
- You must support the scenario where the destination station _is_ Foggy Bottom (e.g. no need to take the Metro).

### Code Requirements
- You must use at least **one** of the following [Kotlin's collection operations](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html#functions) which accepts a [lambda](https://www.geeksforgeeks.org/kotlin-lambdas-expressions-and-anonymous-functions/). Some examples which would be useful:
  - [forEach](https://kotlinlang.org/docs/reference/iterators.html#iterators)
  - [forEachIndexed](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/for-each-indexed.html)
  - [find](https://kotlinlang.org/docs/reference/collection-elements.html)
- You must define and call **one** helper [function](https://kotlinlang.org/docs/reference/functions.html) (can do whatever you want).
- You must use Kotlin's [String Templates](https://kotlinlang.org/docs/reference/basic-syntax.html#using-string-templates) instead of String concatenation (for example, when printing output to console).

### Restrictions
- You may **not** modify the initial set of line `List`s or the `Station` class. You may add additional data structures / variables, if needed.
- You may **not** add additional parameters to the `pathFromFoggyBottom` function.

### Other Notes
- Sometimes the Kotlin Online Playground may not execute your code and tries to "process" for 10 seconds before stopping. If this happens, try refreshing the page.

## Example
Here's an example output for destination code `C01` (Metro Center):
```
Destination:
Metro Center

Line:
Silver

Towards:
Largo Town Center

Path:
Foggy Bottom-GWU
Farragut West
McPherson Square
Metro Center
```
## Submission
1. Paste your final code submission back into `homework2.kt`.
2. Commit and push the change into a **new branch** on GitHub.
3. Submit a **Pull Request** for me to review during gradings (you may merge the PR without waiting for my review).

I will paste your `homework2.kt` into the Online Playground to test during grading.

Your grade will include whether a proper Pull Request was submitted and whether the code executes as expected.

**!!Finally, make sure you submit the URL to your Pull Request on Blackboard!!**

## Grade Breakdown
- 60% Primary Requirements Met
  - 10% Destination Station Name
  - 10% Line Name
  - 10% Train Direction
  - 30% Correct Path Printed
    - I'll be testing stations on each of the lines uniquely (Silver, Orange, Blue)
- 10% Secondary Requirements Met
  - 5% Destination Station / Path Doesn't Exist
  - 5% Destination is Foggy Bottom
- 15% Code Requirements
  - 5% Collection Function with Lambda
  - 5% Helper Function Usage
  - 5% String Templates
- 15% Pull Request Submission
  - 5% Pull Request Made
  - 10% Pull Request contains Full Set of Code Changes (e.g. PR is made correctly)
