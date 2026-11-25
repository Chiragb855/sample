# 1. Create the branch (your uncommitted changes come with you)
git switch -c format

# 2. Commit
git status
git add -u                 # stages all modified tracked files
git add git.md             # stages a new file (git add . would stage every new file)
git commit -m "Format source and config files"

# 3. Push the branch
git push -u origin format

# 4. Switch to main and get the latest from GitHub
git switch main
git pull --no-rebase origin main

# 5. Merge the branch into main and push
git merge --no-ff format -m "Merge branch 'format'"
git push origin main
