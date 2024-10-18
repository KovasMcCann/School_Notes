for unit in Unit_1 Unit_2 Unit_3; do
    find ./$unit -type f -name '*.md' -execdir mv {} README.md \;
done
