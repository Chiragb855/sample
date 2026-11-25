# Git workflow

These steps create a feature branch, commit your changes, merge the branch into
`main`, and push the result to `origin`.

Replace `my-feature` with a short, descriptive branch name.

## 1. Create a branch

Start from an up-to-date `main` branch:

```bash
git switch main
git pull --ff-only origin main
git switch -c my-feature
```

## 2. Commit your changes

Review the changes, stage the files you intend to commit, and create a commit:

```bash
git status
git add <file-or-directory>
git diff --cached
git commit -m "Describe the change"
```

Use `git add .` instead of naming files only if you have reviewed and want to
include every changed file.

## 3. Push the feature branch

```bash
git push -u origin my-feature
```

## 4. Merge into `main`

### Using a pull request (recommended)

Open a pull request from `my-feature` into `main` on your Git hosting service.
After checks and review pass, merge the pull request. Then update your local
`main`:

```bash
git switch main
git pull --ff-only origin main
```

### Merging locally

If your team permits direct pushes to `main`, update it, merge the feature
branch, and push:

```bash
git switch main
git pull --ff-only origin main
git merge --no-ff my-feature
git push origin main
```

If a merge conflict occurs, resolve the marked conflicts, stage the resolved
files with `git add`, and complete the merge with `git commit` before pushing.
