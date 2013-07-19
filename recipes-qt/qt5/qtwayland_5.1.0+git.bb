require qt5-git.inc
require ${PN}.inc

FILESEXTRAPATHS =. "${FILE_DIRNAME}/${BPN}-5.1.0+git:"

# less tested then qtwayland_git.bb with -1
DEFAULT_PREFERENCE = "-2"

# qtwayland doesn't uses wayland-scanner anymore but it's own replacement
DEPENDS += "qtwayland-native"

# qtwayland wasn't released yet, last tag before this SRCREV is 5.0.0-beta1
# this PV is only to indicate that this recipe is compatible with qt5 5.1.0
# while qtwayland_git stays compatible with 5.0.2
PV = "5.1.0+git${SRCPV}"

PR = "${INC_PR}.0"

SRCREV = "ede872db1cdfdc2810c2dd29edd5fb6e1cdac0f5"
