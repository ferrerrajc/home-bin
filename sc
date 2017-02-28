#! /bin/sh
if command -v shellcheck >/dev/null 2>&1; then
        if [ -z "$1" ]; then
                echo >&2 "usage: sc <directory>"
                exit 1
        else
                find "$1" -type f -exec shellcheck {} \;
                exit 0
        fi
else
        echo >&2 "prerequisite missing: shellcheck"
        exit 1
fi
