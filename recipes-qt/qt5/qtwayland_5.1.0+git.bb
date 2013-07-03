require qt5-git.inc
require ${PN}.inc

FILESEXTRAPATHS =. "${FILE_DIRNAME}/${BPN}-5.1.0+git:"

# less tested then qtwayland_git.bb with -1
DEFAULT_PREFERENCE = "-2"

# qtwayland wasn't released yet, last tag before this SRCREV is 5.0.0-beta1
# this PV is only to indicate that this recipe is compatible with qt5 5.1.0
# while qtwayland_git stays compatible with 5.0.2
PV = "5.1.0+git${SRCPV}"

PR = "${INC_PR}.0"

SRCREV = "5672c10bbeff5a10f383017df0dfe29c360d1cb8"
