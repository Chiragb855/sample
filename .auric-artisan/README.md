# Auric Artisan workspace data

This folder is created and maintained by the **Auric Artisan — Color &
Accessibility Intelligence** VS Code extension. Everything here stays on your
machine; nothing is uploaded.

## Contents

| File                               | Purpose                                                                                                                                                                 | Commit?                           |
| ---                                | ---                                                                                                                                                                     | ---                               |
| `settings.json`                    | Workspace-level Auric settings mirrored from the Studio (audit profile, contrast standard, scan scope, …).                                                              | optional — share team defaults    |
| `scan-cache.json`                  | The latest project accessibility scan, reused instead of re-reading the whole workspace each launch.                                                                    | no — regenerated                  |
| `health.json`                      | Production-grade machine-readable record of every health issue (a11y, contrast, color-vision, code-health) with scores, summary and a stable, fingerprinted `issues[]`. | optional — useful in CI           |
| `health.sarif`                     | SARIF 2.1.0 export of the same issues for CI / GitHub code scanning.                                                                                                    | optional                          |
| `health-history.json`              | Append-only trend log (one datapoint per scan) for tracking scores over time.                                                                                           | optional — commit to keep history |
| `knowledge.json`                   | Generated searchable rule, standard, policy, glossary, and article database for the installed Studio capabilities.                                                      | no — regenerated                  |
| `rulebook.md`                      | Generated human-readable accessibility, code-health, and brand rulebooks.                                                                                               | no — regenerated                  |
| `knowledge-overrides.json`         | Validated team-specific policies, articles, manual checks, glossary entries, and rulebooks. Built-in entries cannot be replaced.                                        | yes — share reviewed guidance     |
| `ai-remediation-plan.md` / `.json` | The latest AI-ready remediation plan generated from a scan.                                                                                                             | no — regenerated                  |
| `project-health.md` / `.json`      | The human-readable Project Health report.                                                                                                                               | no — regenerated                  |
| `README.md` / `.gitignore`         | This file and the ignore rules below.                                                                                                                                   | yes                               |

The bundled `.gitignore` keeps the volatile cache and AI plan out of source
control while letting you commit `settings.json` to share team defaults. Delete
the whole folder any time — the extension recreates it on the next scan or
settings update.

## Related

- **Continuous scanning** re-grades the project as you type (toggle in
  *Studio → Settings → Scan engine*, or `auricA11y.scan.live`).
- A workspace-root **`.auricignore`** (gitignore syntax) controls which files
  the scanner reads. Patterns support `*`, `?`, `**`, leading `**/`, anchored
  `/paths`, directory `rules/`, and `!` re-includes.

Folder: `.auric-artisan`
