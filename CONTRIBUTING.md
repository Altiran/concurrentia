# How to Contribute

First and foremost, thank you! We appreciate that you want to contribute to the project, your time is
valuable, and your contributions mean a lot to us.

## Issues

Do not create issues about bumping dependencies unless a bug has been identified, and you can demonstrate that it
affects this library.

**Help us help you**

Remember that we’re here to help, but not to make guesses about what you need help with:

- Whatever bug or issue you're experiencing, assume it will not be as obvious to the maintainers as it is to you.
- Explain the issue thoroughly. Remember, maintainers need to consider all potential use cases. It's crucial to
  detail how you're using the library so maintainers can understand and address the problem effectively.

_It can't be understated how frustrating and draining it can be for maintainers to have to ask clarifying questions on
the most basic things before it's even possible to start debugging. By providing this information upfront, you can
make the best use of everyone's time involved, including yourself._

## General Workflow

1. (External contributors only) Create a fork of the repository.
2. Pull any changes from `main` to make sure you're up-to-date.
3. Create a branch from `main`.
    * Give your branch a name that describes your change (e.g., add-cool-feature).
    * Focus on one change per branch.
4. Commit your changes.
    * Keep your commits small and focused.
    * Write descriptive commit messages in [Conventional Commit](https://www.conventionalcommits.org/en/v1.0.0/) format.
5. When you're ready, create a pull request to `main`.
    * Keep your PRs small (preferably <300 LOC).
    * Format your title in [Conventional Commit](https://www.conventionalcommits.org/en/v1.0.0/) format.
    * List any changes made in your description.
    * Link any issues that your pull request is related to as well.

### Example:

```text
Add cool new feature.

ADDED - New feature that does something cool.
FIXED - Bug that caused the program to crash.
CHANGED - The way the program handles user input.
```

After the pull request has been reviewed, approved, and passes all automated checks, it will be merged into main.
