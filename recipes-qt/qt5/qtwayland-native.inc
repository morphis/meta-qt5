DESCRIPTION = "Native version of QtWayland"
SECTION = "tools"
HOMEPAGE = "http://qt-project.org"

LICENSE = "BSD & LGPL-2.1 | GPL-3.0"
LIC_FILES_CHKSUM = "file://${S}/src/compositor/compositor_api/qwaylandsurfacenode.cpp;endline=40;md5=e38eccd7e9a6a149c9e31b6fb47daac1 \
                    file://${S}/src/compositor/compositor_api/qwaylandcompositor.cpp;endline=39;md5=8897abe415f27031e4237f09db7b9a36 \
"

INC_PR = "r0"
DEPENDS = "qtbase-native wayland-native"

SRC_URI += " \
    file://0001-Install-the-qtwaylandscanner-tool-to-the-native-side.patch \
"

QT_MODULE = "qtwayland"

require qt5-native.inc

do_configure() {
    ${OE_QMAKE_QMAKE} ${OE_QMAKE_DEBUG_OUTPUT} -r ${S}/src/qtwaylandscanner
}

do_install() {
    # Fixup wrong install paths
    # find -name "Makefile" | xargs sed -i "s,(INSTALL_ROOT)${STAGING_DIR_NATIVE},(INSTALL_ROOT),g"

    oe_runmake install INSTALL_ROOT=${D}
}
