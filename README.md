# Java Docker Lab (Dev Container)

This repo is a minimal Java console app setup for Docker + VS Code Dev Containers.

## Prereqs
- Docker Desktop installed and running
- Visual Studio Code installed


## Open in VS Code (Host)
1. Clone the repo
2. Open the folder in VS Code:
   - File → Open Folder…

## Install VS Code Extensions
Install these on the host if not prompted (one-time):
- Docker (Microsoft)
- Dev Containers (Microsoft)
- Extension Pack for Java (Microsoft)

## Open in Dev Container
In VS Code:
1. Ctrl+Shift+P or Cmd+Shift+P
2. Run: **Dev Containers: Reopen in Container**
3. Wait for the container to build and attach

Confirm you are inside the container:
- Bottom-left shows: `Dev Container: Java Docker Lab`
- Terminal `pwd` prints `/app`

## Run (inside container)
- Run the code in debug mode with the debug button on the left.

