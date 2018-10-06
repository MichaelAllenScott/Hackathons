#!/bin/bash
BASEDIR=$(dirname $0)
#psql -U postgres -f "$BASEDIR/dropdb.sql" &&
createdb -U postgres hackathon &&
psql -U postgres -d capstone -f "$BASEDIR/schema.sql" &&